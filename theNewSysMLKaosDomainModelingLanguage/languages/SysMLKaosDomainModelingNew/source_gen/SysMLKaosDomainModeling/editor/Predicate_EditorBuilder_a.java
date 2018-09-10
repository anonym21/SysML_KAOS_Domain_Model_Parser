package SysMLKaosDomainModeling.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;

/*package*/ class Predicate_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Predicate_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_cvnc7u_a();
  }

  private EditorCell createCollection_cvnc7u_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_cvnc7u_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createProperty_cvnc7u_a0());
    editorCell.addEditorCell(createConstant_cvnc7u_b0());
    editorCell.addEditorCell(createConstant_cvnc7u_c0());
    editorCell.addEditorCell(createRefNodeList_cvnc7u_d0());
    editorCell.addEditorCell(createConstant_cvnc7u_e0());
    editorCell.addEditorCell(createRefNode_cvnc7u_f0());
    editorCell.addEditorCell(createConstant_cvnc7u_g0());
    editorCell.addEditorCell(createRefNode_cvnc7u_h0());
    return editorCell;
  }
  private EditorCell createProperty_cvnc7u_a0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_cvnc7u_b0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " : ");
    editorCell.setCellId("Constant_cvnc7u_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.MATCHING_LABEL, "body-paren");
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_cvnc7u_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " !(");
    editorCell.setCellId("Constant_cvnc7u_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_cvnc7u_d0() {
    AbstractCellListHandler handler = new Predicate_EditorBuilder_a.variablesListHandler_cvnc7u_d0(myNode, "variables", getEditorContext());
    EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_variables");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class variablesListHandler_cvnc7u_d0 extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public variablesListHandler_cvnc7u_d0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      return NodeFactoryManager.createNode(MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5dc7L, "SysMLKaosDomainModeling.structure.Variable"), null, getNode(), getNode().getModel());
    }
    private String getSeparatorText() {
      return ", ";
    }
    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(variablesListHandler_cvnc7u_d0.this.getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables")));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    public void installElementCellActions(SNode elementNode, EditorCell elementCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new SChildSubstituteInfo(elementCell, getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables"), elementNode));
        }
      }
    }
    @Override
    public EditorCell createSeparatorCell(SNode prevNode, SNode nextNode) {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), getNode(), variablesListHandler_cvnc7u_d0.this.getSeparatorText());
      editorCell.setSelectable(false);
      Style style = new StyleImpl();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "");
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      editorCell.getStyle().putAll(style);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      return editorCell;
    }
  }
  private EditorCell createConstant_cvnc7u_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "). ");
    editorCell.setCellId("Constant_cvnc7u_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_cvnc7u_f0() {
    SingleRoleCellProvider provider = new Predicate_EditorBuilder_a.antecedentSingleRoleHandler_cvnc7u_f0(myNode, MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498192L, "antecedent"), getEditorContext());
    return provider.createCell();
  }
  private static class antecedentSingleRoleHandler_cvnc7u_f0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public antecedentSingleRoleHandler_cvnc7u_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498192L, "antecedent"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498192L, "antecedent"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498192L, "antecedent"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("antecedent");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498192L, "antecedent")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_antecedent");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no antecedent>";
    }
  }
  private EditorCell createConstant_cvnc7u_g0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, " => ");
    editorCell.setCellId("Constant_cvnc7u_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_cvnc7u_h0() {
    SingleRoleCellProvider provider = new Predicate_EditorBuilder_a.consequentSingleRoleHandler_cvnc7u_h0(myNode, MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498195L, "consequent"), getEditorContext());
    return provider.createCell();
  }
  private static class consequentSingleRoleHandler_cvnc7u_h0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public consequentSingleRoleHandler_cvnc7u_h0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498195L, "consequent"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498195L, "consequent"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498195L, "consequent"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("consequent");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f581469498195L, "consequent")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_consequent");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no consequent>";
    }
  }
}
